# Generics em Java

Os **generics** em Java são um recurso que permite criar classes, interfaces e métodos parametrizados por tipo. Com isso, podemos especificar o tipo de dados a ser utilizado sem precisar definir explicitamente o tipo na implementação, o que aumenta a flexibilidade e a reutilização do código.

## Benefícios dos Generics

### 1. Reuso
Os generics permitem criar classes, interfaces ou métodos que podem trabalhar com diferentes tipos de dados sem a necessidade de reescrever o código.

**Exemplo:**
```java
public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

// Uso:
Box<String> stringBox = new Box<>();
stringBox.setContent("Hello");

Box<Integer> integerBox = new Box<>();
integerBox.setContent(123);

## Reuso com Generics

A classe `Box` pode ser usada com qualquer tipo (`String`, `Integer`, etc.), eliminando a necessidade de criar várias versões específicas.

---

## 2. Type Safety

Com generics, o compilador verifica o tipo em tempo de compilação, reduzindo erros de tipo em tempo de execução. Isso melhora a segurança do código.

### Sem generics (antes de Java 5):
```java
List list = new ArrayList();
list.add("Hello");
String item = (String) list.get(0); // Necessário cast

### Com generics:
```java
List<String> list = new ArrayList<>();
list.add("Hello");
String item = list.get(0); // Não é necessário cast
