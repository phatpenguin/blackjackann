(ns org.phatpenguin.blackjackann.core
  (:require [org.phatpenguin.blackjackann.deck :as deck])
  (:gen-class))


(def players #{:dealer :player})
(def player? (comp boolean players))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (first deck/deck)
  (println "TEST COMPLETE"))