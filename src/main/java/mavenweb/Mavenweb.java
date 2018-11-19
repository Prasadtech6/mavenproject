package mavenweb;

import java.util.Map;

import org.fujion.annotation.Component;
import org.fujion.annotation.Component.PropertyGetter;
import org.fujion.annotation.Component.PropertySetter;
import org.fujion.angular.AngularComponent;
import org.fujion.common.Logger;

@Component(tag = "mavenweb", widgetModule = "fujion-angular-widget", widgetClass = "AngularWidget", parentTag = "*", description="mavenweb")
public class Mavenweb extends AngularComponent {

	private static final Logger log = Logger.create(Mavenweb.class);

	public Mavenweb() {
		super.setSrc("mavenwebproject");
	}
	
	@Override
   protected void _initProps(Map<String, Object> props) {
   	super._initProps(props);
   	props.put("wclazz", "mavenweb");
   }

   @PropertySetter(value = "src", hide = true)
   public void setSrc(String src) {
      throw new UnsupportedOperationException();
   }

}
