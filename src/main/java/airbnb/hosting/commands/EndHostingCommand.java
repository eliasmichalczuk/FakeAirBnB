package airbnb.hosting.commands;

import java.util.UUID;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import airbnb.hosting.dto.HostingStartedDto;
import lombok.Value;

@Value
public class EndHostingCommand {
	@TargetAggregateIdentifier
	public final UUID Id;
}
