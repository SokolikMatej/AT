package org.example.SeleniumGauge_DynamicElements.TC.Sales_Home;

import com.thoughtworks.gauge.Step;
import org.example.SeleniumGauge_DynamicElements.UC.Sales_Home.uc_ChangeGoal;

public class tc_ChangeGoal {
    uc_ChangeGoal changeGoal = new uc_ChangeGoal();


    @Step("Sales-ChangeGoal <Variant>")
    public void editGoal(Enum Variant) throws Exception {
        changeGoal.ChangeGoal();
    }

    @Step("Sales-ChangeGoal-Navigate")
    public void getGoalEntryPoint() {

    }

    @Step("Sales-ChangeGoal-GetData")
    public void getGoalData() {

    }

}
