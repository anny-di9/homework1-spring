import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


    @Component("Registry")
    public class Registry {
        //@Autowired
        private Refferal refferal;

        public Refferal getRefferal() {

            return refferal;
        }

        @Autowired(required = false)
        @Qualifier("Refferal")
        public void setRefferal(Refferal refferal) {

            this.refferal = refferal;
        }

        public void issue_direction() {
            System.out.println("Направление выдано");
            refferal.direct();
        }

}
