package Design.Decorator;

/**
 * @author lirui
 * @ClassName:
 * @Description:
 * @date 2019/4/24 14:00
 */
public abstract class Decorator extends Component {
private Component component;
public void setComponent(Component component){
    this.component=component;
}

    @Override
    public void operation() {
        if (component!=null){
            component.operation();
        }
    }
}
