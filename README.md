Board game Monopoly in the form of a Java console application. 

The board consists of the following 24 tiles:

* 4 corner tiles (start, jail, police (go to jail), tax payment)
* 4 chance tiles (the game must have at least 5 chance cards)
* 16 property tiles

The game starts by inputting the number and names of all the players. After the names have been put in, the game starts. The first player rolls the dice and move their character the corresponding number of tiles. When a player steps on a tile, the effect of the tile triggers. Tile effects:

* jail - the player is just visiting the jail
* police - imprison the player for X turns
* tax payment - the player must pay a specific amount to the bank
* chance - the player draws a chance card from a deck, and the effect of the drawn card is triggered. The players always draw a new card from the deck - not a random one. After the entire deck is drawn, the cards are put back in to the deck, and they can be drawn again.
* property - the player can buy the property for a specific cost if they have enough money and if the property doesn't have an owner. If the property belongs to another player, the player that stepped on the property must pay a "visiting fee" to the owner. The price and visiting fee of each property is fixed.

When a player passes the start tile, they receive some money. If a player can not pay the tax, or a visiting fee they loose the game. The game ends when there is only one player remaining.

