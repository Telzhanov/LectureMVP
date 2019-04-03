package kz.codebusters.lecture

class Main2Presenter: MainContract.Presenter {

    lateinit var view: MainContract.View
    var repository: MainContract.Repository = MainRepository()

    override fun attachView(view: MainContract.View) {
        this.view = view
    }
    override fun getData() {
        view.setData(repository.getData())
    }

}