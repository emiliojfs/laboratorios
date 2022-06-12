@startuml

  Class Klondike
  
  Class Player
  Class Board
  Class Deck
  
  Class Stock
  Class Waste
  Class Tableau
  Class Foundation
  
  Class Movement
  Class Card {
        upturn : boolean
        color : boolean
  }
  enum Rank{
        As
        dos
        tres
        ...
        Queen
        King
  }

  enum Form{
        Heart
        Diamond
        Pike
        Club
  }

  Klondike *-down-Player
  Klondike *-down-Board
  
  Player .. Movement
  Deck *-down-Card
  
  Board *-down-Stock
  Board *-down-Foundation
  Board *-down-Tableau
  Board *-down-Waste
  Board *-down-Deck
  
  Stock o--Card
  Waste o--Card
  Tableau o-- Card
  Foundation o--Card
  
  Movement .. Card
  Card *--> Rank
  Card *--> Form
  
@enduml