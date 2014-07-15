(defproject joplin.elasticsearch "0.1.3"
  :description "Flexible datastore migration and seeding"
  :url "http://github.com/martintrojer/joplin"
  :scm {:name "git"
        :url "https://github.com/martintrojer/joplin"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clojurewerkz/elastisch "2.0.0"]
                 [joplin.core "0.1.3"]])