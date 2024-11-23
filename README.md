# colecoes

# Conjuntos no Java: Set, HashSet, SortedSet e TreeSet

## **Set**
- Interface que define um conjunto de elementos únicos, sem duplicados.
- Implementações comuns incluem **HashSet** e **TreeSet**.

## **HashSet**
- Implementação baseada em tabela hash.
- **Não mantém ordem** dos elementos.
- Oferece operações rápidas (\(O(1)\)) para adicionar, remover e buscar.
- Ideal para cenários onde o desempenho é a prioridade.

## **SortedSet**
- Subinterface de **Set**, garante que os elementos sejam armazenados em ordem natural ou definida por um comparador.
- Inclui métodos úteis, como:
    - `first()`: retorna o menor elemento.
    - `last()`: retorna o maior elemento.
    - `headSet(elemento)`: retorna os elementos menores que o especificado.

## **TreeSet**
- Implementa **SortedSet** e utiliza uma árvore de busca binária (Red-Black Tree).
- Mantém os elementos **ordenados**.
- Oferece operações com desempenho \(O(\log n)\).
- Útil quando a ordem dos elementos importa.

## **HashSet vs TreeSet**
- **HashSet**:
    - Mais rápido (\(O(1)\)).
    - Não ordena os elementos.
- **TreeSet**:
    - Mantém os elementos ordenados.
    - Desempenho mais lento (\(O(\log n)\)).

**Recomendações**:
- Use **HashSet** quando ordem não for relevante e a prioridade for desempenho.
- Use **TreeSet** quando precisar de elementos ordenados.
