# simple-graphql-poc

http://localhost:8080/graphiql

query 1:
        query{
            firstMethod
        }
query 2:
        query{
            secondMethod
        }
query 3:
        query{
            fullName(sampleRequest:{
                fname: "Raj"
                lname: "Das"
          })
        }