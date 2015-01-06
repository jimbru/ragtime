(defproject jimbru/ragtime.sql "0.3.8"
  :description "Ragtime migrations for SQL databases"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [jimbru/ragtime.core "0.3.8"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.3.160"]]}
   :java-jdbc-0.3.x [:dev {:dependencies [[org.clojure/java.jdbc "0.3.2"]]}]})
