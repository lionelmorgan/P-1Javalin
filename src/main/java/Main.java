import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.staticfiles.Location;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
        config.addStaticFiles("/", Location.CLASSPATH);
        }).start(9000);

        app.post("/add-post", context -> {
            int number1 = Integer.parseInt(context.formParam("number1"));
            int number2 = Integer.parseInt(context.formParam("number2"));
            int sum = number1 + number2;
            context.result(String.valueOf(sum));
        });

        app.post("/sub-post", context -> {
            double number3 = Double.parseDouble(context.formParam("number3"));
            double number4 = Double.parseDouble(context.formParam("number4"));
            double sub = number3 - number4;
            context.result(String.valueOf(sub));
        });

        app.post("/mult-post", context -> {
            int number5 = Integer.parseInt(context.formParam("number5"));
            int number6 = Integer.parseInt(context.formParam("number6"));
            int mult = number5 * number6;
            context.result(String.valueOf(mult));
        });

        app.post("/div-post", context -> {
            int number7 = Integer.parseInt(context.formParam("number7"));
            double number8 = Double.parseDouble(context.formParam("number8"));
            double div = number7 / number8;
            context.result(String.valueOf(div));
        });

    }
}