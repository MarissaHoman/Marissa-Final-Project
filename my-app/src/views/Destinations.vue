<template>
  <div class="main">
      <div clas="header">
    <h1 class="title"> Destinations</h1>
  </div>

  <router-link to="/destinations" tag="button" class="button is-primary">Destinations</router-link>

    <div class="content">
        <table id="destinations" class="table">
          <thead>
              <tr>
                  <th>#</th>
                  <th>Destinations</th>
                  <th>City</th>
                  <th>State</th>
                </tr>
            </thead>

            <tbody>
                <tr v-for="destinations in destinations" :key="destinations.id">
                <td>{{destinarions.id}}</td>
                <td>{{destinations.cityName}} {{destinations.stateName}}</td>
              </tr>
            </tbody>
        </table>
      </div>
  </div>
</template>

<script>
export default {
  name: 'Destinations',
  data: () => ({
    actors: []
  }),
  async mounted(){
    console.log('destinations mounted being')
    const{ data } = await this.$http.get('http://localhost:8082/api/destinations');
    console.log('destinations mounted data', data)
    this.actors = data;
  }

}
</script>

<style scoped>
button{
  float: right;
}

</style>