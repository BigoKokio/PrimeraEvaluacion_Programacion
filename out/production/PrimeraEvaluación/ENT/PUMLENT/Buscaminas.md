
## Ejemplo de integración de diagrama PlantUML en Markdown
Se consigue incluyendo el código PlantUML en bloques con 3 comillas como se puede ver en este ejemplo:
~~~
```plantuml
@startuml buscaminas
left to right direction
skinparam packageStyle rectangle
actor jugador
rectangle buscaminas {
  jugador -- (iniciar partida)
  jugador -- (descubrir casilla)
  jugador -- (marcar casilla)
}
@enduml
```
~~~

El código anterior se mostraría así en el documento:

```plantuml
@startuml buscaminas
left to right direction
skinparam packageStyle rectangle
actor jugador
rectangle buscaminas {
  jugador -- (iniciar partida)
  jugador -- (descubrir casilla)
  jugador -- (marcar casilla)
}
@enduml