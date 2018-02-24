package reflection.geradorSql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Coluna {

    public String nome() default "";

    public boolean nulo() default true;

    public int limiteMaximo() default 0;
}
