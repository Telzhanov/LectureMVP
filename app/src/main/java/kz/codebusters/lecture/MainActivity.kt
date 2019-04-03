package kz.codebusters.lecture

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun setData(data: String) {
        txtview.text = data
    }

    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = Main2Presenter()
        presenter.attachView(this)

        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            presenter.getData()
        }
    }
}
