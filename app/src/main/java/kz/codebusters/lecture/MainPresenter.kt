package kz.codebusters.lecture

class MainPresenter: MainContract.Presenter {

    lateinit var view: MainContract.View
    var repository: MainContract.Repository = MainRepository()

    override fun attachView(view: MainContract.View) {
        this.view = view
    }


    override fun getData() {
        view.setData(repository.getData())
    }

}