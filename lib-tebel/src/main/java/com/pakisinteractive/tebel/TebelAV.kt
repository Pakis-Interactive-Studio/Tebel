package com.pakisinteractive.tebel

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.annotation.ColorRes
import androidx.core.widget.TextViewCompat
import com.pakisinteractive.tebel.library.R
import com.pakisinteractive.tebel.library.databinding.ComponentLabelBinding
import com.pakisinteractive.tebel.utils.color
import com.pakisinteractive.tebel.utils.dp
import com.pakisinteractive.tebel.utils.getEnum

class TebelAV @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {
    private val binding: ComponentLabelBinding =
        ComponentLabelBinding.inflate(LayoutInflater.from(context), this, true)

    /**
     * Setter/getter to get/change value of tebel style
     */
    var tebelStyle: TebelStyle? = TebelStyle.Neutral
        set(value) {
            field = value
            setStyle(value)
        }

    /**
     * Setter/getter to get/change value of corner radius
     */
    var radius: CornerRadius? = CornerRadius.ROUND
        set(value) {
            field = value
        }

    /**
     * Setter/getter to get/change value of tebel text
     */
    var text: String?
        get() = binding.tvText.text.toString()
        set(value) {
            binding.tvText.text = value
        }

    /**
     * Setter/getter to get/change value of tebel text color
     */
    var textColor: ColorStateList? = null
        set(value) {
            field = value
        }

    /**
     * Setter/getter to get/change value of tebel background color
     */
    var backgroundColor: ColorStateList? = null
        set(value) {
            field = value
        }

    /**
     * Setter/getter to get/change value of tebel text appearance
     */
    var textAppearance: Int? = null
        set(value) {
            field = value
        }

    init {
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.TebelAV)
            try {
                textColor = typedArray.getColorStateList(
                    R.styleable.TebelAV_android_textColor
                )
                backgroundColor = typedArray.getColorStateList(
                    R.styleable.TebelAV_backgroundColor
                )
                textAppearance =
                    typedArray.getResourceId(R.styleable.TebelAV_textAppearance, -1)
                radius =
                    typedArray.getEnum(R.styleable.TebelAV_radius, CornerRadius.ROUND)
                mapStyle(typedArray.getEnum(R.styleable.TebelAV_variant, Variant.NEUTRAL))
                text = typedArray.getString(
                    R.styleable.TebelAV_android_text
                ).orEmpty()
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                typedArray.recycle()
            }
        }
    }

    private fun mapStyle(variant: Variant) {
        tebelStyle = when (variant) {
            Variant.WARNING -> TebelStyle.Warning
            Variant.ERROR -> TebelStyle.Error
            Variant.SUCCESS -> TebelStyle.Success
            else -> TebelStyle.Neutral
        }
    }

    private fun setStyle(tebelStyle: TebelStyle?) {
        with(binding) {
            root.apply {
                minimumHeight = 16.dp
            }
            tebelStyle?.let {
                val shape = GradientDrawable()
                shape.cornerRadius = when (radius) {
                    CornerRadius.SMALL -> 4.dp.toFloat()
                    CornerRadius.LARGE -> 8.dp.toFloat()
                    else -> {
                        30.dp.toFloat()
                    }
                }
                shape.setColor(context.color(it.backgroundColor))
                backgroundColor?.let { customColor ->
                    shape.color = customColor
                }
                root.background = shape
                tvText.setTextColor(context.color(it.textColor))
                tvText.setPadding(8.dp, 4.dp, 8.dp, 4.dp)
                textColor?.let { customColor ->
                    tvText.setTextColor(customColor)
                }
                textAppearance?.let { style ->
                    if (style != -1) TextViewCompat.setTextAppearance(binding.tvText, style)
                }
            }
        }
    }

    enum class Variant(val value: Int) {
        NEUTRAL(0),
        WARNING(1),
        ERROR(2),
        SUCCESS(3)
    }

    enum class CornerRadius(val value: Int) {
        SMALL(0),
        LARGE(2),
        ROUND(3)
    }

    sealed class TebelStyle(
        @ColorRes open val textColor: Int,
        @ColorRes open val backgroundColor: Int
    ) {
        object Neutral : TebelStyle(R.color.black, R.color.grey20)
        object Warning : TebelStyle(R.color.yellow70, R.color.yellow10)
        object Error : TebelStyle(R.color.red70, R.color.red10)
        object Success : TebelStyle(R.color.green70, R.color.green10)
    }
}