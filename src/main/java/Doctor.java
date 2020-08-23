
import org.springframework.stereotype.Component;

    @Component("Refferal")

    public class Doctor implements Refferal {
        public void direct() {
            System.out.println("Выдано направление");

    }
}
