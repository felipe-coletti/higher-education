const { initializeApp, applicationDefault, cert } = require("firebase-admin/app")
const { getFirestore, Timestamp, FieldValue } = require("firebase-admin/firestore")

const serviceAccount = require("./path/to/serviceAccountKey.json")

initializeApp({
  credential: cert(serviceAccount)
})

const db = getFirestore()

const data = {
  name: "Los Angeles",
  state: "CA",
  country: "USA"
}

const res = db.collection("cities").doc("LA").set(data)
