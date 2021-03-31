(ns usermanager.user.interface
  (:require [usermanager.user.core :as core]))

(defn delete-by-id
  "Given a user ID, delete that user."
  [db id]
  (core/delete-by-id db id))

(defn get-by-id
  "Given a user ID, return the user record."
  [db id]
  (core/get-by-id db id))

(defn get-users
  "Return all available users, sorted by name.

  Since this is a join, the keys in the hash maps returned will
  be namespace-qualified by the table from which they are drawn:

  addressbook/id, addressbook/first_name, etc, department/name"
  [db]
  (core/get-users db))

(defn save
  "Save a user record. If ID is present and not zero, then
  this is an update operation, otherwise it's an insert."
  [db user]
  (core/save db user))
