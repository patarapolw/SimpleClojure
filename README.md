# SimpleClojure

Using Clojure REPL and scripts, without an IDE.

## Setting up

- Installing Clojure is easy. Follow the instructions in <https://clojure.org>
- Also, install <https://leiningen.org>. It will help manage additional dependencies for the REPL.
- Then, navigate to the folder you want, for the future containing `project.clj`, and several other Clojure scripts.
- Start the REPL by running,

```commandline
lein repl
```

## Adding dependencies to the REPL

- Create a Clojure script named `project.clj`, and put this inside,

```clojure
(defproject project-name "0.0.1"
  :dependencies [
      [dependency-name "x.x.x"]
  ])
```

## Importing a script to the REPL

Although you can run the script using `lein script.clj`, you can also do this in the REPL,

```clojure
user=> (load-file "script.clj")
```
