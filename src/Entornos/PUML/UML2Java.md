# De diagrama de clases UML a clases Java

## Asociaciones "Uno a Uno" (0..1 ó 1)
### Direccional

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Empleado {
    - nombre : String
}

class Dirección {
    - calle : String
    - ciudad : String
}
Empleado "1" --> "1" Dirección

@enduml
```

```java
public class Empleado {
    private String nombre;
    private Dirección dirección;
}

public class Dirección {
    private String calle;
    private String ciudad;
}
```

### Bidireccional

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Empleado {
    - nombre : String
}

class Dirección {
    - calle : String
    - ciudad : String
}
Empleado "1" -- "1" Dirección

@enduml
```

```java
public class Empleado {
    private String nombre;
    private Dirección dirección;
}

public class Dirección {
    private String calle;
    private String ciudad;
    private Empleado empleado;
}
```


## Asociaciones con multiplicidad *
### Bidireccional "Uno a Muchos" ó "Muchos a Uno"

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Empleado {
    - nombre : String
    - apellidos : String
}

class Departamento {
    - nombre : String
}
Empleado "*" --- "1" Departamento

@enduml
```

```java
public class Empleado {
    private String nombre;
    private String apellidos;
    private Departamento departamento;
}

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;
}
```

### Bidireccional "Muchos a Muchos"

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Empleado {
    - nombre : String
    - apellidos : String
}

class Proyecto {
    - nombre : String
}
Empleado "*" --- "*" Proyecto

@enduml
```

```java
public class Empleado {
    private String nombre;
    private String apellidos;
    private List<Proyecto> proyectos;
}

public class Proyecto {
    private String nombre;
    private List<Empleado> empleados;
}
```

### Recursiva

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Empleado {
    - nombre : String
    - apellidos : String
}

Empleado "0..1" -- "0..*" Empleado : supervisa <

@enduml
```

```java
public class Empleado {
    private String nombre;
    private String apellidos;
    private Empleado responsable;
    private List<Empleado> subordinados;
}
```

## Asociaciones múltiples

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Equipo {
}
class Jugador {
}

Equipo "1" -- "1..*" Jugador : jugadores >
Equipo "0..1" -- "1" Jugador : capitán <


@enduml
```

```java
public class Equipo {
    private List<Jugador> jugadores;
    private Jugador capitán;
}

public class Jugador {
    private Equipo juega;
    private Equipo capitanea; 
}
```

## Agregación

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Coche {}
class Motor {}
class Rueda {}

Coche "1" o-- "1" Motor
Coche "1" o-- "4" Rueda
@enduml
```

```java
public class Motor {
}

public class Rueda {
}

public class Coche {
    private Motor motor;
    private List<Rueda> ruedas;

    public Coche (Motor motor, List<Rueda> ruedas) {
        this.motor = motor;
        this.ruedas = ruedas;
    }
}
```

## Composición

```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Persona {}
class Corazón {}
class Brazo {}

Persona "1" *-- "1" Corazón
Persona "1" *-- "2" Brazo
@enduml
```

```java
public class Corazón {
}

public class Brazo {
}

public class Persona {
    private final Corazón corazón;
    private final List<Brazo> brazos;

    public Persona () {
        this.corazón = new Corazón();
        this.brazos = new ArrayList<Brazo>();
    }
}
```

## Herencia
```plantuml
@startuml
skinparam classAttributeIconSize 0
left to right direction

class Animal {
    - sonido : String
}
class Vaca {}
class Oveja {}

Animal <|--  Vaca
Animal <|--  Oveja
@enduml
```

```java
public class Animal {
    String sonido;
    public Animal (String sonido) {
        this.sonido = sonido;
    }
}

public class Vaca extends Animal {
    public Vaca() {
        this.sonido = "muu";
    }
}

public class Oveja extends Animal {
    public Oveja() {
        super("bee");
    }
}
```