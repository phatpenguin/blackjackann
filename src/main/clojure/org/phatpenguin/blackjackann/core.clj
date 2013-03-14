(ns org.phatpenguin.blackjackann.core
  (:require [org.phatpenguin.blackjackann.deck :as deck])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [card-and-deck (deck/draw-card deck/new-deck)]
  (println (first card-and-deck))
    (count (last card-and-deck))))