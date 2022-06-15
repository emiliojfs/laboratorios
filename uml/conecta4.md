@startuml
  Class Conecta4
  
  Class Player
  Class Board
  
  Class Turn
  Class Table
  Class Row
  Class Column
  Class Cell
  Class Token{
      color :boolean
      inUse :boolean
  }
  
  Conecta4 *-down- "2" Player 
  Conecta4 *-down-Board
  
  Player .down.>Turn
  
  Board *-down-Table
  Board *-down-"42" Token
  
  Table *-down- "42" Cell
  
  Turn -right-> Token
  
  Token ..> Cell
  
  Cell --> Row
  Cell --> Column
  
@enduml