import React from 'react'
import { Button, Grid, Stack, TextField, Typography } from '@mui/material';
import { initGame } from '../api/Tennis';
import { useNavigate } from 'react-router-dom';

const StartGame = () => {
  let navigate = useNavigate()

  const handleSubmit = (event) => {
    event.preventDefault();
    const data = new FormData(event.currentTarget);
    const players = {
      firstPlayerName: data.get('firstPlayerName'),
      secondPlayerName: data.get('secondPlayerName'),
    }

    initGame(players).then(() => {
      navigate("/board", {replace: true});
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
        <Grid item xs={12}>
          <Typography fontSize={34} textAlign='center' marginBottom={3}>Initialize Game</Typography>
        </Grid>
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