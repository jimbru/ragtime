# Ragtime

Ragtime is a Clojure library for migrating structured data. It defines
a common interface for expressing migrations, much like [Ring][1]
defines a common interface for expression web applications.

[1]: https://github.com/ring-clojure/ring

## Libraries

* ragtime.core -
  database independent tools and functions for managing migrations

* ragtime.sql -
  an adapter for applying migrations to a SQL database

* ragtime.sql.files -
  provides a way of specifying migrations as SQL script files

* ragtime.lein -
  a Leiningen plugin that wraps ragtime.core

## Installation

Add ragtime.core as a dependency if you just want the database-
independent core:

```clojure
:dependencies [[jimbru/ragtime.core "0.3.8"]]
```

Or add the full library if you want support for SQL databases:

```clojure
:dependencies [[jimbru/ragtime "0.3.8"]]
```

If you want to integrate Ragtime into Leiningen:

```clojure
:plugins [[jimbru/ragtime.lein "0.3.8"]]
```

## Documentation

* [Wiki](https://github.com/jimbru/ragtime/wiki)
* [API docs](http://jimbru.github.com/ragtime)

## License

Copyright © 2014 James Reeves.
Portions copyright © 2015 Jim Brusstar.

Distributed under the Eclipse Public License, the same as Clojure.
