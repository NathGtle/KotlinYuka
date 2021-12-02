package com.gatellier.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.fragment_details_summary_quantity.view.*

class ItemValueView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val title: TextView
    private val value: TextView
    private val divider: View

    init {
        inflate(context, R.layout.fragment_details_summary_quantity, this)

        title = findViewById(R.id.item_value_title)
        value = findViewById(R.id.item_value_value)
        divider = findViewById(R.id.item_value_divider)

        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.ItemValueView,
            0, 0
        ).apply {

            try {
                title.text = getString(R.styleable.ItemValueView_title)
                value.text = getString(R.styleable.ItemValueView_value)
                divider.visibility = if (getInt(
                        R.styleable.ItemValueView_dividerVisibility,
                        0
                    ) == 0
                ) View.VISIBLE else View.GONE
            } finally {
                recycle()
            }
        }

    }
}
