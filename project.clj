(defproject jimbru/ragtime "0.3.8"
  :description "A database-independent migration library"
  :url "https://github.com/jimbru/ragtime"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git"
        :url "https://github.com/jimbru/ragtime.git"}
  :dependencies [[jimbru/ragtime.core "0.3.8"]
                 [jimbru/ragtime.sql "0.3.8"]
                 [jimbru/ragtime.sql.files "0.3.8"]]
  :plugins [[lein-sub "0.2.1"]
            [codox "0.8.10"]]
  :sub ["ragtime.core" "ragtime.sql" "ragtime.sql.files"]
  :codox {:sources ["ragtime.core/src"
                    "ragtime.sql/src"
                    "ragtime.sql.files/src"]
          :exclude [ragtime.sql.database ragtime.main]})
