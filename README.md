# Java Collections: Set, List, ArrayList, HashSet, SortedSet, TreeSet e Queue

Este documento apresenta um resumo detalhado sobre **Set**, **List**, **Queue** e suas principais implementações no Java: **HashSet**, **TreeSet**, **ArrayList** e **LinkedList** (como fila). Ele serve como guia para entender suas características e escolher a implementação mais adequada para cada caso.

---

## **1. Set**
### Visão Geral
- Interface que representa um conjunto de elementos **únicos**, ou seja, não permite duplicatas.
- Implementações comuns incluem **HashSet**, **TreeSet** e **LinkedHashSet**.

### **HashSet**
- Baseado em uma tabela hash.
- **Não mantém a ordem** dos elementos.
- Operações como adicionar, remover e buscar têm desempenho médio de \(O(1)\).
- Ideal para cenários onde a ordem não importa e o desempenho é a prioridade.

### **SortedSet**
- Subinterface de **Set** que garante que os elementos sejam armazenados em uma **ordem natural** ou definida por um comparador.
- Principais métodos:
  - `first()`: Retorna o menor elemento.
  - `last()`: Retorna o maior elemento.
  - `headSet(elemento)`: Retorna elementos menores que o especificado.

### **TreeSet**
- Implementa **SortedSet** e é baseado em uma **árvore de busca binária** (Red-Black Tree).
- Mantém os elementos **ordenados** (ordem natural ou por comparador).
- Operações têm desempenho médio de \(O(\log n)\).

### **HashSet vs TreeSet**
| **Aspecto**         | **HashSet**                            | **TreeSet**                           |
|----------------------|----------------------------------------|---------------------------------------|
| **Ordenação**        | Não mantém ordem.                     | Ordena automaticamente.              |
| **Desempenho**       | Mais rápido (\(O(1)\)).               | Mais lento (\(O(\log n)\)).          |
| **Uso Recomendado**  | Para cenários onde a ordem não importa. | Quando é necessário manter ordenação. |

---

## **2. List**
### Visão Geral
- Interface que representa uma coleção **ordenada**, onde duplicatas são permitidas.
- Os elementos têm posições específicas (índices), permitindo acesso direto e manipulação.
- Implementações principais: **ArrayList**, **LinkedList**, **Vector**, **CopyOnWriteArrayList**.

---

## **3. ArrayList**
### Características
- Implementação da interface **List** baseada em um **array dinâmico**.
- Permite redimensionamento automático e mantém a **ordem de inserção** dos elementos.
- Ideal para cenários com muitas leituras e poucas inserções/remoções.

### **Vantagens**
1. **Redimensionamento Automático**:
  - Ajusta a capacidade interna conforme necessário.
2. **Acesso Rápido por Índice**:
  - Operação de busca é rápida (\(O(1)\)).
3. **Flexibilidade**:
  - Oferece métodos como `add`, `remove`, `get`, e `contains`.

### **Desvantagens**
1. **Custo de Inserção/Remoção**:
  - Inserir ou remover elementos do meio pode ser caro (\(O(n)\)) devido ao deslocamento dos elementos.
2. **Desempenho Variável**:
  - Operações de expansão podem ser caras em termos de tempo e memória.

### **Métodos Comuns**
- `add(E e)`: Adiciona um elemento ao final da lista.
- `add(int index, E e)`: Insere um elemento em uma posição específica.
- `remove(int index)`: Remove o elemento de uma posição.
- `get(int index)`: Retorna o elemento de um índice.
- `set(int index, E e)`: Substitui o elemento em um índice específico.
- `size()`: Retorna o número de elementos.

---

### **ArrayList vs Array**
| **Aspecto**       | **ArrayList**                             | **Array**                              |
|--------------------|-------------------------------------------|----------------------------------------|
| **Tamanho**       | Dinâmico, cresce automaticamente.        | Fixo, definido na criação.            |
| **Métodos**       | Possui métodos como `add`, `remove`, etc. | Nenhum método integrado.              |
| **Performance**   | Menor controle, mas mais flexível.        | Mais eficiente para operações simples.|
| **Flexibilidade** | Muito mais versátil.                      | Limitado ao tamanho inicial.          |

---

## **4. Queue**
### Conceitos Principais
1. **Fila (Queue)**:
  - Estrutura de dados **FIFO** (*First In, First Out*), onde o primeiro elemento inserido é o primeiro a ser removido.
  - A implementação **LinkedList** é utilizada para criar a fila.

2. **Adição de Elementos**:
  - `add(E e)`: Adiciona um elemento à fila. Lança uma exceção (`IllegalStateException`) se a fila estiver cheia.
  - `offer(E e)`: Também adiciona um elemento, mas retorna `false` se a fila estiver cheia, sem lançar exceção.

3. **Consulta de Elementos**:
  - `peek()`: Retorna o elemento na frente da fila sem removê-lo. Retorna `null` se a fila estiver vazia.
  - `element()`: Semelhante ao `peek()`, mas lança uma exceção (`NoSuchElementException`) se a fila estiver vazia.

4. **Remoção de Elementos**:
  - `poll()`: Remove e retorna o elemento na frente da fila. Retorna `null` se a fila estiver vazia.
  - `remove()`: Remove e retorna o elemento na frente da fila. Lança uma exceção (`NoSuchElementException`) se a fila estiver vazia.

---
## **5. Stack**
### Visão Geral
A **Pilha (Stack)** é uma estrutura de dados **LIFO** (*Last In, First Out*), onde o último elemento adicionado é o primeiro a ser removido. Em Java, a classe `Stack` é a implementação mais comum.

### **Métodos Comuns**
1. `push(E e)`: Adiciona um elemento ao topo da pilha.
2. `pop()`: Remove e retorna o elemento no topo da pilha. Lança exceção se a pilha estiver vazia.
3. `peek()`: Retorna o elemento no topo da pilha sem removê-lo.
4. `empty()`: Verifica se a pilha está vazia.
5. `search(Object o)`: Retorna a posição de um elemento na pilha (topo = posição 1).


## **Conclusão**
- Use **HashSet** para conjuntos únicos onde a ordem não importa e o desempenho é essencial.
- Use **TreeSet** para conjuntos únicos que devem ser ordenados.
- Use **ArrayList** para listas redimensionáveis com acesso rápido por índice e ordem mantida.
- Use **Queue** para implementar filas baseadas na lógica FIFO, aproveitando métodos como `poll` e `offer` para gerenciar elementos de forma segura.
- Use **Stack** para cenários onde o último elemento inserido deve ser o primeiro a ser removido (**LIFO**), como histórico de navegação ou algoritmos de retrocesso (*backtracking*).
