package airbnb.hosting.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.Value;

@Value
public class StartHostingCommand {

	@TargetAggregateIdentifier
	public final int Id;
}
