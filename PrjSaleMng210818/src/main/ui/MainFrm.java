package ui;

import controller.MainController;

public class MainFrm extends BasicFrm{
    public  MainFrm() {
        super(800, 700, "님 환영합니다");
        String msg = MainController.getInstance().getSession().getUserName()+"님 환영합니다.";
        setTitle(msg);
    }

    @Override
    public void init() {

    }

    @Override
    public void arrange() {

    }
}
