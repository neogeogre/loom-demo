### project loom usage

To use loom you need java 19 with `--enable-preview` in the run configuration.

```shell
sdk install java 19.0.2-amzn
```

At the moment of the creation of this project gradle does not support java 19.

Loom is for generating non-blocking virtual threads at the JVM level. 
Running the main example will give:
```
start ...
wait for threads execution ...
thread over after 100 ms
thread over after 110 ms
over
```

