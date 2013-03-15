(ns org.phatpenguin.blackjackann.core
  (:require [org.phatpenguin.blackjackann.deck :as deck])
  (:require [org.phatpenguin.blackjackann.player :as player])
  (:gen-class))

(defrecord gamestate [number-of-decks players game-deck hands-played decks-played])
(def initial-gamestate
  (gamestate. 1
    (list player/ann-player player/dealer-player)
    deck/new-deck 0 0))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [card-and-deck (deck/draw-card deck/new-deck true)]
  (println (first card-and-deck))
    (count (last card-and-deck))))