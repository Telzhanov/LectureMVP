package kz.codebusters.lecture

interface MainContract {

    interface View {
        fun setData(data: String)
    }

    interface Presenter {
        fun attachView(view: View)
        fun getData()
    }

    interface Repository {
        fun getData(): String
    }
}