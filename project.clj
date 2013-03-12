(defproject blackjackann "1.0.0-SNAPSHOT"
  :description "Blackjack ANN"
  :target-dir "target/"

  :source-paths ["src/main/clojure"]
  :library-path "target/dependency"
  :test-paths ["src/test/clojure" "src/test/resources"]
  :resource-paths ["src/main/resources"]
  :main "org.phatpenguin.blackjackann.core"
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.slf4j/slf4j-api "1.6.2"]
                 [org.slf4j/slf4j-log4j12 "1.6.2"]
                 [org.slf4j/log4j-over-slf4j "1.6.2"]
		 ]
  :aot [org.phatpenguin.blackjackann.core])