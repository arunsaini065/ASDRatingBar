package com.chrome.asd

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.asd_rating_bar.*

class AsdRattingBar(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.asd_rating_bar)
        ivRateOne.setOnClickListener {
            ivRateOne.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateTwo.setImageResource(R.drawable.ic_star_empty)
            ivRateThree.setImageResource(R.drawable.ic_star_empty)
            ivRateFour.setImageResource(R.drawable.ic_star_empty)
            ivRateFive.setImageResource(R.drawable.ic_star_empty)
            llReact.visibility=View.VISIBLE
            tvFirstRect.visibility=View.GONE
            ivReact.setImageResource(R.drawable.img_guide1)
            tvReact.text="oh, no!"
            tvRateButton.isEnabled=true
            ivEnable.visibility=View.GONE
            tvSecondReact.text="Please leave us some feedback"
        }
        ivRateTwo.setOnClickListener {
            ivRateTwo.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateOne.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateThree.setImageResource(R.drawable.ic_star_empty)
            ivRateFour.setImageResource(R.drawable.ic_star_empty)
            ivRateFive.setImageResource(R.drawable.ic_star_empty)
            llReact.visibility=View.VISIBLE
            tvFirstRect.visibility=View.GONE
            ivReact.setImageResource(R.drawable.img_guide2)
            tvReact.text="oh, no!"
            tvRateButton.isEnabled=true
            ivEnable.visibility=View.GONE
            tvSecondReact.text="Please leave us some feedback"

        }
        ivRateThree.setOnClickListener {
            ivRateOne.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateTwo.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateThree.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateFour.setImageResource(R.drawable.ic_star_empty)
            ivRateFive.setImageResource(R.drawable.ic_star_empty)
            llReact.visibility=View.VISIBLE
            tvFirstRect.visibility=View.GONE
            ivReact.setImageResource(R.drawable.img_guide3)
            tvReact.text="oh, no!"
            tvRateButton.isEnabled=true
            ivEnable.visibility=View.GONE
            tvSecondReact.text="Please leave us some feedback"

        }
        ivRateFour.setOnClickListener {
            ivRateOne.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateFour.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateTwo.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateThree.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateFive.setImageResource(R.drawable.ic_star_empty)
            llReact.visibility=View.VISIBLE
            tvFirstRect.visibility=View.GONE
            ivReact.setImageResource(R.drawable.img_guide4)
            tvReact.text="We like you too!"
            tvRateButton.isEnabled=true
            ivEnable.visibility=View.GONE
            tvSecondReact.text="Thanks for your feedback"

        }
        ivRateFive.setOnClickListener {
            ivRateFive.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateOne.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateFour.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateTwo.setImageResource(R.drawable.baseline_star_black_36dp)
            ivRateThree.setImageResource(R.drawable.baseline_star_black_36dp)
            llReact.visibility=View.VISIBLE
            tvFirstRect.visibility=View.GONE
            ivReact.setImageResource(R.drawable.img_guide5)
            tvReact.text="We like you too!"
            tvRateButton.isEnabled=true
            ivEnable.visibility=View.GONE
            tvSecondReact.text="Thanks for your feedback"

        }
        tvRateButton.setOnClickListener {
            Toast.makeText(it.context,"click",Toast.LENGTH_SHORT).show()
        }
    }


}