# IZO829

## Java Streams
* Think of a stream pipeline as an assembly line in a factory
* With streams, the data isn’t generated up front—it is created when needed.
* Since streams use lazy evaluation, the **intermediate** operations do not run until the terminal operation runs.
* Since streams can be used only once, the stream is no longer valid after a **terminal** operation completes.
### `reduce()`
* The `reduce()` method combines a stream into a single object. It is a reduction, which means it processes all elements
### `map()`
* mapping refers to a process that transforms each element of a stream into a new element, creating a new stream of modified elements
* In the language of the stream API, the `collect() `method performs what is called a mutable reduction

### flatmap()

### Optional
* `ifPresent(Consumer c)` Calls Consumer with value
* spliterators are iterators that provide support for parallel iteration


### partitioning
* Partitioning is a special case of grouping. With partitioning, there are only two possible groups: true and false

## Collections
* The Java Collections Framework standardizes the way in which groups of objects are handled by programs
* Algorithms operate on collections and are defined as _**static**_ methods within the Collections class
* There is something called `NavigableSet<E>` that extends `SortedSet<E>` oh!, you want to be a master of such!!!
* `offer() `only attempts to add an element to a queue. Because some **queues** have a fixed length and might be full, offer( ) can fail
* `ListIterator` extends `Iterator` to allow bidirectional traversal of a list, and the modification of elements.
* `Comparable` is an interface and `comparator` is a class