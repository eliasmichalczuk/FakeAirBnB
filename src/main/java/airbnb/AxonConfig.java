package airbnb;

import javax.annotation.PostConstruct;

import org.axonframework.config.EventHandlingConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

private final EventHandlingConfiguration eventHandlingConfiguration;

@Autowired
public AxonConfig(EventHandlingConfiguration eventHandlingConfiguration) {
   this.eventHandlingConfiguration = eventHandlingConfiguration;
}

public void Configuration() {
	
}
}

/*@PostConstruct
public void registerErrorHandling() {
   eventHandlingConfiguration.configureListenerInvocationErrorHandler(configuration -> (exception, event, listener) -> {
       String msg = String.format(
               "[EventHandling] Event handler failed when processing event with id %s. Aborting all further event handlers.",
               event.getIdentifier());
       throw exception;
   });
}}*/