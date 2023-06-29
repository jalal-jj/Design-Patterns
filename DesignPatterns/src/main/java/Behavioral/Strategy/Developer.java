package Behavioral.Strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Developer {
    private Activity activity;

    public Developer(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.doSomething();
    }
}
