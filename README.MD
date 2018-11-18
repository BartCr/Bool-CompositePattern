# Composite Pattern

Deze opdracht heeft als doel om het composite pattern toe te kunnen passen.
Het is ineens ook een oefening op refactoring.

## Context

De kerstman wilt ook wel eens meedoen met al dat gedoe van kerstversiering, en beslist daarom om zijn huis te versieren tijdens de kerstperiode.
Hij heeft zijn huis helemaal voorbereid, maar helaas heeft Amazon zijn domoticapakket niet op tijd geleverd.
De enige oplossing is om per versiering een elf te stationeren en via walkie-talkie's aan elke elf te laten weten dat hij de versiering moet aanzetten.
Hij komt er al snel achter dat de walkie-talkie's niet van goede kwaliteit zijn (made in China).
Een set van 4 walkie-talkie's is op voorhand ingesteld op een vaste (unieke) frequentie en de kerstman heeft maar plaats voor 1 walkie-talkie in zijn broekzak.

Dat wordt dus een sobere versiering van 3 stuks...

## Oefening 1

De oplossing is simpel: als hij gewoon extra elfjes inschakelt met twee walkie-talkie's van twee verschillende sets, kunnen die met versieringselfjes communiceren!

Vb. Als hij 5 stuks versiering wilt hebben:
* Set 1: kerstman, elf1, versieringelf1, versieringelf2
* Set 2: elf1, versieringelf3, versieringelf4, versieringelf5

**Voeg Walkie-talkie-elfjes toe aan de code met behulp van het composite-pattern**

## Oefening 2a: Refactoring

You know what to do.

## Oefening 2b: Aantal versieringen

De kerstman is nogal vergeetachtig en zou graag willen kunnen opvragen hoeveel elfjes hij nu heeft geoutsourcet voor zijn hobbyproject.
Gebruik de huidige structuur van het composite pattern om dit op te vragen.
