(defproject antizer "0.3.3"
  :description "Antizer"
  :url "https://github.com/priornix/antizer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.11.4"]
                 [cljsjs/antd "4.6.1-0"]
                 [cljsjs/moment "2.24.0-0"]]
  :plugins [[lein-codox "0.10.3"]]
  :codox {:language :clojurescript
          :metadata {:doc/format :markdown}
          :output-path "doc/dist/latest/api"
          :namespaces [antizer.core antizer.reagent antizer.rum]})
