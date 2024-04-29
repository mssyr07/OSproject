package utils;


import pages.A;
import pages.B;
import pages.ClubsPage;
import pages.LoginPage;


public class Pages {
    private final A a;
    private final B b;

    private final LoginPage loginPage;

    private final ClubsPage clubsPage;




    public Pages(){
        a = new A();
        b = new B();
        loginPage = new LoginPage();
        clubsPage = new ClubsPage();



    }

    public A getA() {
        return a;
    }

    public B getB() {return b;}

    public LoginPage getLoginPage(){return loginPage; }

    public ClubsPage getClubsPage() {return clubsPage;
    }
}
