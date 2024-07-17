# Chain of Responsibility Pattern ( aka CoR or Filter Chain)

Is a simple implementation of chaining Filters in a pipe using  generics interfaces. Pump (producer) and Sink (consumer) is defined as input and output parameter from the pipeline

## FilterBase
The class FilterBase<T> provides the base functionality for filter classes. It uses the "Chain of Responsibility" pattern to process a request (i.e., text transformation) by passing it along a chain of objects (filters) until one of them handles it. This class has a single responsibility of executing the given input with the process(T input) method and then passing it onto the next filter in the chain (if one exists).

## Filter Interface:
The Filter<T> interface specifies the methods that concrete filter classes have to implement. These methods are execute(T input) and register(Filter<T> filter).

## FilterChain Interface:
The FilterChain<T> interface is the interface used for managing Filters. It has methods to executed a given input and to register filters into a pipeline.

## Pipeline class:
This Pipeline<T> class is the main class in the chain of responsibility pattern. It represents the start of these chains, and has a root filter, which is the first filter that the input is passed to. The register method allows to connect multiple filters in a pipeline manner.

## UpperCaseFilter class - example:
The UpperCaseFilter class extends the FilterBase class and it modifies the given string input to uppercase. It is an actual filter to process data.

This effectively allows you to create a processing pipeline with as many transformation steps as you need, where each step can be developed and tested independently. 
It also makes it easy to add new transformations (filters) or re-order existing ones.


### references: 
- [Pipes And Filters](http://www.eaipatterns.com/PipesAndFilters.html)
- [Architecture Pipe and Filter](http://www.dossier-andreas.net/software_architecture/pipe_and_filter.html)
