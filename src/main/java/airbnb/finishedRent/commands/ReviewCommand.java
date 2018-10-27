package airbnb.finishedRent.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class ReviewCommand {

	@TargetAggregateIdentifier
	public long Id;
	public long UsuarioId;
	public long QuartoId;
	
}
