(defproject ragtime "0.4.0-SNAPSHOT"
  :description "A database-independent migration library"
  :dependencies [[ragtime/ragtime.core "0.4.0-SNAPSHOT"]
                 [ragtime/ragtime.sql "0.4.0-SNAPSHOT"]
                 [ragtime/ragtime.sql.files "0.4.0-SNAPSHOT"]]
  :plugins [[lein-sub "0.2.1"]
            [codox "0.8.10"]]
  :sub ["ragtime.core" "ragtime.sql" "ragtime.sql.files"]
  :codox {:sources ["ragtime.core/src"
                    "ragtime.sql/src"
                    "ragtime.sql.files/src"]
          :exclude [ragtime.sql.database ragtime.main]})
