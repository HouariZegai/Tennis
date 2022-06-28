import React from 'react'
import { Button, Grid, Stack } from '@mui/material';
import TextField from '@mui/material/TextField';
import { initGame } from '../api/Tennis';

const StartGame = () => {

  const handleSubmit = (event) => {
    const data = new FormData(event.currentTarget);
    const players = {
      firstPlayerName: data.get('firstPlayerName'),
      secondPlayerName: data.get('secondPlayerName'),
    }
    console.log(players);

    initGame(players).then(() => {
      // TODO: go to the next page
      console.log('Game initialized! Go to the next page..');
    })
    .catch(err => {
      alert(err)
    })
  }
  
  return (
    <Grid
      container
      spacing={0}
      direction="column"
      alignItems="center"
      justifyContent="center"
      style={{ minHeight: '100vh' }}>
      <Grid item xs={3}>
        <Stack
          component="form"
          onSubmit={handleSubmit}
          sx={{width: '30ch'}}
          spacing={2}
          >
            <TextField name="firstPlayerName" label="Player 1 Name" required />
            <TextField name="secondPlayerName" label="Player 2 Name" required />
            <Button variant="contained" type="submit">Start Game</Button>
        </Stack>
      </Grid>
    </Grid>
  )
}

export default StartGame