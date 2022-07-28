package homework.homework3;

public class Financial_record {
    int money;
    int nomoney;
    public Financial_record(int incomes, int outcomes ){
this.money = incomes;
this.nomoney = outcomes;

    }


    public String getEarnings() {
        return "доходы = " + money;
    }
    public String  setAntiearnigs() {
return "расходы = " + nomoney;

    }
}
