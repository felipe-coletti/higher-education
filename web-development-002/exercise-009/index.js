const { initializeApp, applicationDefault, cert } = require("firebase-admin/app")
const { getFirestore, Timestamp, FieldValue } = require("firebase-admin/firestore")

const serviceAccount = require("")

initializeApp({
  credential: cert(serviceAccount)
})

const db = getFirestore()

const data = {
  name: "name",
  state: "state",
  country: "country"
}

const res = db.collection("schedules").doc("LA").set(data)
