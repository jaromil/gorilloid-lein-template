(defproject {{ns-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies ^:replace [[org.clojure/clojure "1.8.0"]
                           [org.clojure/data.json "0.2.6"]
                           [org.clojure/data.csv "0.1.3"]
                           [clj-http "3.1.0"]
                           [cheshire "5.6.3"]
                           [clojure-humanize "0.2.0"]

                           ;; gorilla-repl deps
                           [http-kit "2.2.0"]
                           [ring/ring-json "0.4.0"]
                           [compojure "1.5.1"]
                           [org.slf4j/slf4j-api "1.7.21"]
                           [ch.qos.logback/logback-classic "1.1.7"]
                           [gorilla-renderable "2.0.0"]
                           [gorilla-plot "0.1.4"]
                           [javax.servlet/servlet-api "2.5"]
                           [grimradical/clj-semver "0.3.0" :exclusions [org.clojure/clojure]]
                           [cider/cider-nrepl "0.12.0"]
                           [org.clojure/tools.nrepl "0.2.12"]
                           ]
  :source-paths ["src"]
  :resource-paths ["resources"]
  :template-additions ["ws/index.clj"]
  :main ^:skip-aot gorilla-repl.core
  :profiles {:uberjar {:aot [gorilla-repl.core {{ns-name}}.core]}}
  :target-path "target/%s"
  )
