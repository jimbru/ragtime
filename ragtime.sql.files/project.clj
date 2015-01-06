(defproject ragtime/ragtime.sql.files "0.4.0-SNAPSHOT"
  :description "Ragtime adapter that reads migrations from SQL files."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [ragtime/ragtime.sql "0.4.0-SNAPSHOT"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.3.160"]]}
   :java-jdbc-0.3.x [:dev {:dependencies [[org.clojure/java.jdbc "0.3.2"]]}]})
